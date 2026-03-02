package utils;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
/**
 *
 * @author janot
 */
public class PrecioFilter extends DocumentFilter{

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
            throws BadLocationException {

        if (string == null) return;

        if (esValido(fb, offset, string)) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
            throws BadLocationException {

        if (text == null) return;

        if (esValido(fb, offset, text)) {
            super.replace(fb, offset, length, text, attrs);
        }
    }

    private boolean esValido(FilterBypass fb, int offset, String text)
            throws BadLocationException {

        String contenidoActual = fb.getDocument().getText(0, fb.getDocument().getLength());
        String nuevoTexto = new StringBuilder(contenidoActual)
                .insert(offset, text)
                .toString();

        // Permite números con hasta 2 decimales
        return nuevoTexto.matches("\\d*(\\.\\d{0,2})?");
    }

}
