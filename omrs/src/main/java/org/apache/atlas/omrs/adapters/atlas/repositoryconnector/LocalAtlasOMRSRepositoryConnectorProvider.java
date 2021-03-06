/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.atlas.omrs.adapters.atlas.repositoryconnector;

import org.apache.atlas.omrs.metadatacollection.repositoryconnector.OMRSRepositoryConnectorProviderBase;
import org.apache.atlas.omrs.rest.repositoryconnector.OMRSRESTRepositoryConnector;

/**
 * In the Open Connector Framework (OCF), a ConnectorProvider is a factory for a specific type of connector.
 * The OMRSRESTRepositoryConnectorProvider is the connector provider for the OMRSRESTRepositoryConnector.
 * It extends OMRSRepositoryConnectorProviderBase which in turn extends the OCF ConnectorProviderBase.
 * ConnectorProviderBase supports the creation of connector instances.
 *
 * The OMRSRESTRepositoryConnectorProvider must initialize ConnectorProviderBase with the Java class
 * name of the OMRS Connector implementation (by calling super.setConnectorClassName(className)).
 * Then the connector provider will work.
 */
public class LocalAtlasOMRSRepositoryConnectorProvider extends OMRSRepositoryConnectorProviderBase
{
    /**
     * Constructor used to initialize the ConnectorProviderBase with the Java class name of the specific
     * OMRS Connector implementation.
     */
    public LocalAtlasOMRSRepositoryConnectorProvider()
    {
        Class    connectorClass = OMRSRESTRepositoryConnector.class;

        super.setConnectorClassName(connectorClass.getName());
    }
}