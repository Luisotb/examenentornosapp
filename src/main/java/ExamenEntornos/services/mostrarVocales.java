package ExamenEntornos.services;

import org.springframework.stereotype.Service;

@Service
public class mostrarVocales {

  public static String mostrador(String palabra) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < palabra.length(); i++) {
      // Check if our list of vowels contains the current char. If the current char exists in the String of vowels, it will have an index of 0 or greater.
      if ("AEIOUaeiou".indexOf(palabra.charAt(i)) > -1) {
        // If so, add it to our StringBuilder
        sb.append(palabra.charAt(i));
      }
    }

    // Finally, print the result
    return sb.toString();
  }
}
