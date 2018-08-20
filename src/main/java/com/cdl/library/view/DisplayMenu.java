package com.cdl.library.view;

import static java.lang.System.out;

import com.cdl.java8.CheckString;

public class DisplayMenu {

    public enum Menus {
        NEW_ACCOUNT(1, "Open New Account"),
        FIND_BOOK(2, "Find Book"),
        ISSUE_BOOK(3, "Issue Book");

        Menus(int pointer, String text) {
            this.text = text;
            this.pointer = pointer;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        private String text;

        public int getPointer() {
            return pointer;
        }

        public void setPointer(int pointer) {
            this.pointer = pointer;
        }

        private int pointer;

    }

    public void displayMenus() {

        Menus[] values = Menus.values();
        final String joiner = ". ";
        for (Menus menu : values) {

            boolean menuAllAlpha = checkMenuIsAlphaCharactersOnly(
                    removeWhiteASpacesCheckAlpha(menu.getText()), text -> text.chars().allMatch(Character::isLetter));
            if (menuAllAlpha) {
                out.println(menu.getPointer() + joiner + menu.getText());
            }
        }
    }

    private static boolean checkMenuIsAlphaCharactersOnly(String text, CheckString<String> menu) {

        return menu.checkIsString(text);
    }

    private static String removeWhiteASpacesCheckAlpha(String originalText) {

        return originalText.replace(" ", "");
    }
}
