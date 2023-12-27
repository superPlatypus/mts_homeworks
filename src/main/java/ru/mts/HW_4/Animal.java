package ru.mts.HW_4;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * интерфейс для возвращения информации о животном
 */
public interface Animal {
    /**
     * Возвращает породу животного
     * @return порода животного
     */
    String getBreed();

    /**
     * Возвращает имя животного
     * @return имя животного
     */
    String getName();

    /**
     * Возвращает цену животного
     * @return цена животного
     */
    BigDecimal getCost();

    /**
     * Возвращает характер животного
     * @return харакет животного
     */
    String getCharacter();

    LocalDate getBirthDay();
}
