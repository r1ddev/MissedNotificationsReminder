package com.app.missednotificationsreminder.settings.sound

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class SoundViewStateTest {

    @Test
    fun `sound settings expose alarm reminder mode`() {
        val fieldNames = SoundViewState::class.java.declaredFields.map { it.name }

        assertThat(fieldNames).contains("useAlarmVolume")
    }
}
