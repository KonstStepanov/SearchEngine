package UtilClases;

import java.util.List;

/**
 * Интерфейс описывающий методы поискового движка
 */
public interface SearchEngine {
    List<PageEntry> search(String[] word);
}
