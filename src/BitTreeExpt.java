import java.io.PrintWriter;

public class BitTreeExpt {
  public static void main(String[] args) throws Exception {
    // BitTree<String> test1 = new BitTree<>(6);
    // PrintWriter pen = new PrintWriter(System.out, true);
    // BrailleASCIITables tes = new BrailleASCIITables();
    // BrailleASCIITables.brailleAscii.dump(pen);
    int brailleCodePoint = 0x283F; // Unicode code point for Braille pattern dots-123456
    char[] brailleCharacter = Character.toChars(brailleCodePoint);
    System.out.println(new String(brailleCharacter));
  }
}
