package com.devopsbuddy.web.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;
import java.util.Locale;


@Service
public class I18NService {

    @Autowired
    private MessageSource messageSource;
/**
*returns the message for the given message ID and the default locale in the session context
* @param messageId the key to the messages resource file
*
**/
    public String getMessage(String messageId){
        Locale locale = LocaleContextHolder.getLocale();
        return getMessage(messageId, locale);
    }

    /**
     * returns message for the given message id and locale
     * @param messageId key to the message resource file
     * @param locale the locale
     **/

    public String getMessage(String messageId, Locale locale){
        return messageSource.getMessage(messageId, null, locale);
    }
}
