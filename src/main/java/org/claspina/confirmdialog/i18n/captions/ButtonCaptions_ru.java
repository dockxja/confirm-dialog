package org.claspina.confirmdialog.i18n.captions;

import org.claspina.confirmdialog.ButtonType;

import java.util.ListResourceBundle;


/**
 * I18n for the button captions. This class contains the translations for language code 'ru'.
 */
public class ButtonCaptions_ru extends ListResourceBundle {

    /**
     * See {@link ListResourceBundle#getContents()}
     */
    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {ButtonType.OK.name(), "ОК"},
                {ButtonType.ABORT.name(), "Прервать"},
                {ButtonType.CANCEL.name(), "Отмена"},
                {ButtonType.YES.name(), "Да"},
                {ButtonType.NO.name(), "Нет"},
                {ButtonType.CLOSE.name(), "Закрыть"},
                {ButtonType.SAVE.name(), "Сохранить"},
                {ButtonType.RETRY.name(), "Повторить"},
                {ButtonType.IGNORE.name(), "Игнорировать"},
                {ButtonType.HELP.name(), "Справка"},
        };
    }

}

