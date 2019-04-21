package org.michaelbel.data.remote.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Session(
        @SerializedName("success") val success: Boolean,
        @SerializedName("session_id") val sessionId: String
): Serializable