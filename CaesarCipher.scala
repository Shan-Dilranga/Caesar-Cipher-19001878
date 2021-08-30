object CaesarCipher extends App{
  import scala.io.StdIn.{readInt, readLine}//for getting inputs from console
  println("Enter the Text:")
  val str = readLine("")
  print("Enter no of shifts:")
  val n = readInt()

  def encrypt = (c:Char, key:Int) => ((c.toUpper + key + 26 - 'A') % 26 + 'A').toChar //encrypt method
  def decrypt = (c:Char, key:Int) => ((c.toUpper - key + 26 - 'A') % 26 + 'A').toChar //decrypt method

  def cipher = (algo: (Char, Int)=>Char, text: String, key: Int) => text.map(algo(_, key))

  val cipherText = cipher(encrypt, str, n)
  val plainText = cipher(decrypt, cipherText, n)

  println(str,cipherText, plainText)
}
