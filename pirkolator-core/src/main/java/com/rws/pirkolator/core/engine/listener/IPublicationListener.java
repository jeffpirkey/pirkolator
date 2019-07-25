/*******************************************************************************
 * Copyright 2013 Reality Warp Software
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.rws.pirkolator.core.engine.listener;

import java.util.UUID;

import com.rws.pirkolator.core.engine.Publication;

/**
 * This interface defines a component that listens for new {@link Publication} register
 * or unregister requests. 
 * 
 * @author jpirkey
 *
 */
public interface IPublicationListener {

    void registerPublication(UUID publisherId, Publication publication);

    void unregisterPublication(UUID publisherId, Publication publication);
}
