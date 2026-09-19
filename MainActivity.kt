package com.example.myempty.mytast
Go ahead and paste these import statements at the very top of your file, just below the package line.

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
 private lateinit var speechRecognizer: SpeechRecognizer, 
      private lateinit var recognizerIntent: Intent.
   speechRecognizer = SpeechRecognizer.createSpeechRecognizer(this)
recognizerIntent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
 putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)
 putExtra(RecognizerIntent.EXTRA_LANGUAGE, "en-US")
} super.onCreate(savedInstanceState) 
    = SpeechRecognizer.createSpeechRecognizer(this)
recognizerIntent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
 putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)
 speechRecognizer.setRecognitionListener(object : RecognitionListener {
 override fun onReadyForSpeech(params: Bundle?) {}
 override fun onBeginningOfSpeech() {}
 override fun onRmsChanged(rmsdB: Float) {}
 override fun onBufferReceived(buffer: ByteArray?) {}
 override fun onEndOfSpeech() {}
 override fun onError(error: Int) {}
 override fun onResults(results: Bundle?) {}
 override fun onPartialResults(partialResults: Bundle?) {}
 override fun onEvent(eventType: Int, params: Bundle?) {}
})recordingButton.setOnClickListener {
 speechRecognizer.startListening(recognizerIntent)
}

putExtra(RecognizerIntent.EXTRA_LANGUAGE, "en-US")
}

speechRecognizer.startListening(recognizerIntent)
recordingButton.setOnClickListener {
 speechRecognizer.startListening(recognizerIntent)
}speechRecognizer = SpeechRecognizer.createSpeechRecognizer(this)
recognizerIntent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
    putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)
    putExtra(RecognizerIntent.EXTRA_LANGUAGE, "en-US")
} speechRecognizer = SpeechRecognizer.createSpeechRecognizer(this) 
 putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)
 putExtra(RecognizerIntent.EXTRA_LANGUAGE, "en-US")
}speechRecognizer.setRecognitionListener(object : RecognitionListener {
 override fun onReadyForSpeech(params: Bundle?) {}
 override fun onBeginningOfSpeech() {}
 override fun onRmsChanged(rmsdB: Float) {}
 override fun onBufferReceived(buffer: ByteArray?) {}
 override fun 


speechRecognizer = SpeechRecognizer.createSpeechRecognizer(this)
recognizerIntent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
    putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)
    putExtra(RecognizerIntent.EXTRA_LANGUAGE, "en-US")
}      setContentView(R.layout.activity_main)
    }
}