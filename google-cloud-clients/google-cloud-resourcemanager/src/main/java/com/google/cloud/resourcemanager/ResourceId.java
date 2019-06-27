/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.resourcemanager;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.Serializable;
import java.util.Objects;

public class ResourceId implements Serializable {

  private final String id;
  private final String type;

  private ResourceId(String id, String type) {
    this.id = checkNotNull(id);
    this.type = checkNotNull(type);
  }

  public String getId() {
    return id;
  }

  public String getType() {
    return type;
  }

  @Override
  public boolean equals(Object obj) {
    return obj instanceof ResourceId && Objects.equals(toPb(), ((ResourceId) obj).toPb());
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  public static ResourceId of(String id, String type) {
    return new ResourceId(checkNotNull(id), checkNotNull(type));
  }

  com.google.api.services.cloudresourcemanager.model.ResourceId toPb() {
    return new com.google.api.services.cloudresourcemanager.model.ResourceId()
        .setId(id)
        .setType(type);
  }

  static ResourceId fromPb(
      com.google.api.services.cloudresourcemanager.model.ResourceId resourcePb) {
    return new ResourceId(resourcePb.getId(), resourcePb.getType());
  }
}
