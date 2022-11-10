import javax.swing.JLabel
import javax.swing.JOptionPane
import javax.swing.JPanel
import javax.swing.JPasswordField

fun main() {
    val panel = JPanel()
    val label = JLabel("Enter a password:")
    val pass = JPasswordField()
    panel.add(label)
    panel.add(pass)
    val options = arrayOf("OK", "Cancel")
    val option = JOptionPane.showOptionDialog(
        null, panel, "The title",
        JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options, options[0]
    )
    if (option == 0) // pressing OK button
    {
        val password = pass.password
        println("Your password is: " + String(password))
    }
}
