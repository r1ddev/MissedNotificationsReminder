package com.app.missednotificationsreminder.settings.sound

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class SoundViewStateTest {

    @Test
    fun `alarm playback change updates sound state`() {
        val initial = SoundViewState(
                ringtone = "",
                ringtoneName = "",
                useAlarmVolume = false)

        val updated = SoundViewStatePartialChanges.AlarmVolumeChange(true).reduce(initial)

        assertThat(updated.useAlarmVolume).isTrue()
    }
}
