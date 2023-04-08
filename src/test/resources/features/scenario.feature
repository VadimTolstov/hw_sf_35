#Запускать в один поток или разкоментировать 17 строку
Feature: Смог тест Иви
 #Позитивный сценарий: находим через поиск фильм, добовляем его в избранное, проверяем
 # что фильм добавлен в избранное
  Scenario: Добавить фильм в избранное
    Given url ivi 'https://www.ivi.ru/'
    When  website is open close the ad
    Then click on search
    Then find a movie 'Назад в будущее'
    Then check an open movie 'Назад в будущее (Фильм 1985)'
    Then add a movie to favorites
    And go to the favorites list
    Then find a movie in favorites 'Назад в будущее'

 #Негативный сценарий
  Scenario: Регистрация пользователя с некоректным email
    Given url ivi 'https://www.ivi.ru/'
  #  When  website is open close the ad
    #навести мышь на аватар
    Then hover the mouse over the avatar
    # нажать на 'Войти или зарегестрироваться'
    And click on 'Войти или зарегистрироваться'
    #ввести в поле 'sasmail.ru' и нажать ввод
    Then enter in the field 'sasmail.ru'
    #появилось сообщение 'Ошибка'
    And a message appeared 'Ошибка'
    #  And assert that chosen city is 'Краснодар'
 #Негатинвый сценарий: выбираем несушествующий город, получаем соответствуещее уведомление
 # Scenario: chose absent city
 #   Given url of restaurant 'https://dodopizza.ru/'
 #   Then  chose city 'Лапландия'
 #   And assert that user got message 'Пиццерия в этом городе еще не открылась'