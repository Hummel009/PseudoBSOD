package hummel

import java.awt.EventQueue
import java.awt.Image
import java.awt.Toolkit
import javax.imageio.ImageIO
import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.UIManager

fun main() {
	EventQueue.invokeLater {
		try {
			for (info in UIManager.getInstalledLookAndFeels()) {
				if ("Windows Classic" == info.name) {
					UIManager.setLookAndFeel(info.className)
					break
				}
			}
			val frame = BSOD()
			frame.isVisible = true
		} catch (e: Exception) {
			e.printStackTrace()
		}
	}
}

class BSOD : JFrame() {
	init {
		val imageStream = BSOD::class.java.getResourceAsStream("/bsod.jpg")
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