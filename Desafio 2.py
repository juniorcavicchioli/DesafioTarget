def fibonacci_lista(n):
    """
    Cria uma lista com todos os números da sequência de Fibonacci menores ou iguais a um número limite n.
    :param n: O número inteiro que determina o limite superior da sequência de Fibonacci.
    :type n: int
    :return: Uma lista contendo todos os números da sequência de Fibonacci menores ou iguais a n.
    :rtype: list[int]
    :author: Junior Cavicchioli <https://github.com/juniorcavicchioli/fibonacci>
    """
    lista = [0]
    i = 1
    while lista[-1] <= n:
        lista.append(formula_fechada(i))
        i += 1
    return lista


def formula_fechada(n):
    """
    Encontra o enésimo termo sem a necessidade de percorrer toda a
    sequência até chegar nele usando a fórmula de Binet.
    :param n: O número do termo desejado na sequência de Fibonacci.
    :type n: int
    :return: O número inteiro na posição n da sequência de Fibonacci.
    :rtype: int
    :author: Junior Cavicchioli <https://github.com/juniorcavicchioli/fibonacci>
    """
    fn = 1 / 5 ** 0.5 * (1 / 2 + 5 ** 0.5 / 2) ** n - 1 / 5 ** 0.5 * (1 / 2 - 5 ** 0.5 / 2) ** n
    return round(fn)


# Programa principal
while True:
    try:
        numero = int(input("Digite um número inteiro: "))
        break
    except ValueError:
        print("O valor digitado não é um número inteiro válido. Tente novamente.")
lista = fibonacci_lista(numero)
if numero in lista:
    pertence = ''
else:
    pertence = ' não'

print(f"{numero}{pertence} está na sequencia de fibonacci.")
