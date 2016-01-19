/**
 * JBoss, Home of Professional Open Source.
 * Copyright 2014 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.pnc.rest.restmodel;

import org.jboss.pnc.model.Artifact;
import org.jboss.pnc.spi.repositorymanager.RepositoryManagerResult;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author <a href="mailto:matejonnet@gmail.com">Matej Lazar</a>
 */
@XmlRootElement(name = "repositoryManagerResult")
public class RepositoryManagerResultRest implements RepositoryManagerResult{
    private List<Artifact> builtArtifacts;
    private List<Artifact> dependencies;
    private String buildContentId;

    public RepositoryManagerResultRest() {}

    public RepositoryManagerResultRest(RepositoryManagerResult result) {
        builtArtifacts = result.getBuiltArtifacts();
        dependencies = result.getDependencies();
        buildContentId = result.getBuildContentId();
    }

    @Override
    public List<Artifact> getBuiltArtifacts() {
        return builtArtifacts;
    }

    @Override
    public List<Artifact> getDependencies() {
        return dependencies;
    }

    @Override
    public String getBuildContentId() {
        return buildContentId;
    }
}
