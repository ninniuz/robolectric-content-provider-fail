package it.ninniuz.android.robocontentprovider

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric

@RunWith(AndroidJUnit4::class)
class FailingContentProviderTest {

    @Before
    fun setUp() {
        Robolectric.setupContentProvider(FakeContentProvider::class.java)
    }

    @Test
    fun test() {
    }
}