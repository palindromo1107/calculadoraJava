package com.mycompany.mavenproject1;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LimiteCaracteres extends PlainDocument {
    private int limite;

    public LimiteCaracteres(int limite) {
        super();
        this.limite = limite;
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null || getLength() >= limite) {
            return;
        }

        int total = getLength() + str.length();
        if (total <= limite) {
            super.insertString(offset, str, attr);
        } else {
            // Se ultrapassar, só insere parte da string
            int sobra = limite - getLength();
            if (sobra > 0) {
                super.insertString(offset, str.substring(0, sobra), attr);
            }
        }
    }
}