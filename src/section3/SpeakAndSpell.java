package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("speak Otorhinolaryngologist");
		// 2. Catch the user's answer in a String
		String hi = JOptionPane.showInputDialog("Spell It");
		// 3. If the user spelled the word correctly, speak "correct"
				// 4. Otherwise say "wrong"
		
		// 5. repeat the process for other words
		if (hi.equalsIgnoreCase("Otorhinolaryngologist")) {
			speak("correct");
		}else {
			speak("wrong.");
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
