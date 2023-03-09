
# Git y Github

1. Si aún no lo hizo, cree una cuenta en Github (o Gitlab si prefiere), e instale y configure el cliente de GIT que va a utilizar (colocando su nombre y dirección de correo electrónico), por ejemplo  GitHub Desktop.
1. Cree un repositorio remoto nuevo, sin ningún archivo y **clonelo** localmente.
1. Localmente, agregue un archivo txt, con un texto cualquiera, haga su primer commit y verifique que NO esté en el repositorio remoto. ¿Por qué no está?
1. Ahora haga el **push** correspondiente y verifique que si esté
1. Modifique el archivo desde la interfaz web de Github, verifique que dicho cambio NO está aplicado localmente ¿Por qué no está?
1. Ahora ejecute el comando correspondiente para traer los cambios y verifique que son visibles.
1. Vuelva a modificar el archivo desde la interfaz web de Github, y antes de hacer el**pull**, modifique algo DISTINTO en su copia local y haga un **commit** de dichos cambios.
1. Ahora pruebe hacer un **push** de sus cambios. ¿Qué sucedió? ¿ cómo puede proseguir?
1. Arregle el problema

En este punto, recomendamos, aunque no es obligatorio, que dentro de un repositorio (por ejemplo el que creó recién), tengan una carpeta por clase (dictada teórica) del curso, y dentro de cada clase tengan un proyecto con los ejercicios con los que se va avanzando. Puede arrancar subiendo los que realizó en la clase 1. Para no tener problemas, también recomendamos que en la raíz del proyecto tenga un archivo **.gitignore** (notar el punto “.” al principio del nombre del archivo) para evitar versionar cosas que no corresponden. Puede descargarlo/copiarlo de este [link ](https://www.toptal.com/developers/gitignore/api/java,maven,eclipse,intellij+iml,intellij+all,netbeans,web)y se agrega al proyecto como cualquier otro archivo, solo que cumple la función vista en clase.