// Copyright 2000-2023 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.cce.evaluation

import com.intellij.cce.workspace.filter.SessionsFilter
import com.intellij.cce.workspace.info.FileSessionsInfo
import com.intellij.cce.workspace.storages.SessionsStorage

class FilteredSessionsStorage(private val filter: SessionsFilter, private val storage: SessionsStorage) : SessionsStorage(storage.storageDir) {
  override fun getSessions(path: String): FileSessionsInfo {
    val sessionsInfo = storage.getSessions(path)
    val filteredSessions = filter.apply(sessionsInfo.sessions)
    return FileSessionsInfo(sessionsInfo.projectName, sessionsInfo.filePath, sessionsInfo.text, filteredSessions)
  }

  override fun getSessionFiles(): List<Pair<String, String>> = storage.getSessionFiles()
}
