package com.kittyspace

object NativeManager {
    external fun applyPatch(offset: Long, hexData: String): Boolean
    external fun restorePatch(offset: Long): Boolean
    external fun applyHook(offset: Long, methodName: String): Boolean
}
