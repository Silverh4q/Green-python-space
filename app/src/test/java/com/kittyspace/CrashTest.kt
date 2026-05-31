package com.kittyspace

import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.Robolectric
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [33], manifest = Config.NONE)
class CrashTest {
    @Test
    fun testNativeDumperInit() {
        try {
            println("Loading NativeDumper...")
            val dumper = NativeDumper
            println("NativeDumper loaded!")
        } catch (e: Throwable) {
            e.printStackTrace()
            throw e
        }
    }
    
    @Test
    fun testMainActivity() {
        try {
            Robolectric.buildActivity(MainActivity::class.java).create().start().resume()
            println("MainActivity created!")
        } catch (e: Throwable) {
            e.printStackTrace()
            throw e
        }
    }
}
