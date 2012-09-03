package org.jooq.eclipse.indigo.editor.configuration;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.jooq.eclipse.widget.configuration.ConfigurationPropertiesPage;

public class ConfigurationEditor extends MultiPageEditorPart implements IResourceChangeListener {

	private static final int PAGE_INDEX_EDITOR = 0;
	private static final int PAGE_INDEX_CONFIGURATION = 1;
	
	private TextEditor editorPage;
	private ConfigurationPropertiesPage configurationPage;

	public ConfigurationEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}

	@Override
	protected void createPages() {
		createEditorPage();
		createPropertiesPage();
		addListeners();
	}

	void createEditorPage() {
		try {
			editorPage = new TextEditor();
			addPage(PAGE_INDEX_EDITOR, editorPage, getEditorInput());
			setPageText(PAGE_INDEX_EDITOR, editorPage.getTitle());
		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(),
					"Error creating nested text editor", e.getMessage(), e.getStatus());
		}
	}

	void createPropertiesPage() {
		Composite container = getContainer();
		configurationPage = new ConfigurationPropertiesPage(container);
		addPage(PAGE_INDEX_CONFIGURATION, configurationPage);
		setPageText(PAGE_INDEX_CONFIGURATION, "jOOQ Configuration");
	}
	
	private void addListeners() {
		addPageChangedListener(new IPageChangedListener() {
			
			@Override
			public void pageChanged(PageChangedEvent e) {
				Object selected = e.getSelectedPage();
				if (selected == editorPage) {
					
				} else if (selected == configurationPage) {
					FileEditorInput fileEditorInput = (FileEditorInput) editorPage.getEditorInput();
					IFile file = fileEditorInput.getFile();
					File javaFile = file.getRawLocation().makeAbsolute().toFile();
					// TODO: Use input stream
					configurationPage.reloadConfig(javaFile);
				}
			}
		});
	}

	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		super.dispose();
	}

	public void doSave(IProgressMonitor monitor) {
		getEditor(PAGE_INDEX_EDITOR).doSave(monitor);
	}

	public void doSaveAs() {
		IEditorPart editor = getEditor(PAGE_INDEX_EDITOR);
		editor.doSaveAs();
		setPageText(PAGE_INDEX_EDITOR, editor.getTitle());
		setInput(editor.getEditorInput());
	}

	public void gotoMarker(IMarker marker) {
		setActivePage(PAGE_INDEX_EDITOR);
		IEditorPart editor = getEditor(PAGE_INDEX_EDITOR);
		IDE.gotoMarker(editor, marker);
	}

	public void init(IEditorSite site, IEditorInput editorInput) throws PartInitException {

		if (!(editorInput instanceof IFileEditorInput)) {
			throw new PartInitException("Invalid Input: Must be IFileEditorInput");
		}

		super.init(site, editorInput);
	}

	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	@Override
	protected void pageChange(int newPageIndex) {
		super.pageChange(newPageIndex);
	}

	public void resourceChanged(final IResourceChangeEvent event) {
		closeAll(event);
	}

	private void closeAll(final IResourceChangeEvent event) {
		if (event.getType() == IResourceChangeEvent.PRE_CLOSE) {
			Runnable async = new Runnable() {
				public void run() {
					IWorkbenchPage[] pages = getSite().getWorkbenchWindow().getPages();
					
					for (int i = 0; i < pages.length; i++) {
						FileEditorInput fileEditorInput = (FileEditorInput) editorPage.getEditorInput();
						IFile file = fileEditorInput.getFile();
						if (file.getProject().equals(event.getResource())) {
							IWorkbenchPage page = pages[i];
							IEditorPart editorPart = page.findEditor(editorPage.getEditorInput());
							page.closeEditor(editorPart, true);
						}
					}
				}
			};

			Display.getDefault().asyncExec(async);
		}
	}

}