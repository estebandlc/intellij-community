// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.platform.runtime.repository;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

public final class MalformedRepositoryException extends RuntimeException {
  @ApiStatus.Internal
  public MalformedRepositoryException(@NotNull String message) {
    super(message);
  }

  @ApiStatus.Internal
  public MalformedRepositoryException(@NotNull String message, @NotNull Throwable cause) {
    super(message, cause);
  }
}
