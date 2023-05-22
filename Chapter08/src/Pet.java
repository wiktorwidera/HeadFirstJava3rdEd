public interface Pet {
    // Interface jest zawsze public a jego metody są zawsze abstract,
    // więc słowo public w "public interface Pet" można pominąć
    // podobnie jest ze słowem abstract w metodach, np "abstract void play();"
    void beFriendly(); // można zapisać jako abstract void beFriendly(), ale w interfejsie metody są zawsze abstract
    void play();
}
