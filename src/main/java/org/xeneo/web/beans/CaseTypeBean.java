/*
 * Copyright 2012 XENEO.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.xeneo.web.beans;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Stefan Huber
 */
@Component("casetype")
@Scope("request")
public class CaseTypeBean {

    private String caseTypeName;
    private String caseTypeDescription;

    public CaseTypeBean() {
    }

    public String getCaseTypeDescription() {
        return caseTypeDescription;
    }

    public void setCaseTypeDescription(String caseTypeDescription) {
        this.caseTypeDescription = caseTypeDescription;
    }

    public String getCaseTypeName() {
        return caseTypeName;
    }

    public void setCaseTypeName(String caseTypeName) {
        this.caseTypeName = caseTypeName;
    }

    public String savecasetype() {
        
        FacesContext context = FacesContext.getCurrentInstance();
        
        if(caseTypeName.equals("")||caseTypeDescription.equals("")){
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "All Fields are required!", ""));
            
        }

        return null;
    }
}
