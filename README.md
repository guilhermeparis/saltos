# Saltos

Recebida uma String "quase binária", como "m10101100111m", por exemplo, que representa um caminho, onde:<br>
* 'm' é uma margem (há uma margem no início e outra no fim do caminho) <br>
* 1 são espaços permitidos<br>
* 0 são espaços proibidos<br>

Queremos calcular de quantas maneiras pode-se atravessar o caminho, sendo que é possível saltar 1, 2 ou 3 espaços por vez, porém quando salta-se 3 espaços, não é possível realizar um salto de 3 espaços novamente.<br>
Os resultados são calculados com um método recursivo, um método recursivo com memorização e um método sem recursão.