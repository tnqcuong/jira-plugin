package com.example.customfields;

import com.atlassian.jira.issue.customfields.impl.GenericTextCFType;
import com.atlassian.jira.issue.customfields.manager.GenericConfigManager;
import com.atlassian.jira.issue.customfields.persistence.CustomFieldValuePersister;
import com.atlassian.plugin.spring.scanner.annotation.component.Scanned;
import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;

@Scanned
public class JiraCustomField extends GenericTextCFType {

	protected JiraCustomField(@ComponentImport CustomFieldValuePersister customFieldValuePersister,
			@ComponentImport GenericConfigManager genericConfigManager) {
		super(customFieldValuePersister, genericConfigManager);
		// TODO Auto-generated constructor stub
	}

}
