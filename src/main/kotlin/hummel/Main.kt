package hummel

import java.awt.EventQueue
import java.awt.Image
import java.awt.Toolkit
import java.util.*
import javax.imageio.ImageIO
import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.JLabel

fun main() {
	EventQueue.invokeLater {
		try {
			val frame = BSOD()
			frame.isVisible = true
		} catch (e: Exception) {
			e.printStackTrace()
		}
	}
}

class BSOD : JFrame() {
	init {
		val os = System.getProperty("os.name").lowercase(Locale.getDefault())
		val version = System.getProperty("os.version")

		val fileName = if (os.contains("win")) {
			if (version.startsWith("6.1") || version.startsWith("6.0")) {
				"/7.png"
			} else if (version.startsWith("6.") || version.startsWith("10.")) {
				"/10.png"
			} else {
				null
			}
		} else {
			null
		}
		fileName?.let {
			val imageStream = BSOD::class.java.getResourceAsStream(fileName)
			defaultCloseOperation = DO_NOTHING_ON_CLOSE
			isResizable = false
			isUndecorated = true
			isAlwaysOnTop = true
			size = Toolkit.getDefaultToolkit().screenSize
			val originalImage = ImageIO.read(imageStream)
			val screenSize = Toolkit.getDefaultToolkit().screenSize
			val scaledImage = originalImage.getScaledInstance(screenSize.width, screenSize.height, Image.SCALE_SMOOTH)
			val imageIcon = ImageIcon(scaledImage)
			val imageLabel = JLabel(imageIcon)
			imageLabel.setBounds(0, 0, width, height)
			add(imageLabel)
			setLocationRelativeTo(null)
		}
	}
}