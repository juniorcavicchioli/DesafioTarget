import json


def menor_valor(lista):
    menor = lista[0]
    for i in lista:
        if i != 0 and i < menor:
            menor = i
    return menor


def maior_valor(lista):
    maior = 0
    for i in lista:
        if i > maior:
            maior = i
    return maior


def contar_dif_zero(lista):
    contagem = 0
    for numero in lista:
        if numero != 0:
            contagem += 1
    return contagem


def calcular_media(lista):
    dias = contar_dif_zero(lista)
    total = 0
    for i in lista:
        total += i
    return total / dias


def dias_acima_media(lista):
    contagem = 0
    media = calcular_media(lista)
    for i in lista:
        if i > media:
            contagem += 1
    return contagem


# como não tinha um JSON disponível, fiz um sozinho. Para teste, o array equivalente seria:
# faturamento = [1500.0, 1000.0, 2000.0, 0, 3000.0, 2500.0, 0, 1800.0, 2800.0, 2000.0, 2200.0, 0, 1500.0, 1900.0, 2700.0, 2300.0, 2400.0, 2000.0, 0, 2600.0, 2800.0, 2900.0, 2200.0, 2300.0, 1500.0, 0, 1800.0, 2000.0, 2100.0, 2500.0, 2200.0]
with open('faturamento.json') as f:
    faturamento = json.load(f)['faturamento_diario']

menor_vlr = menor_valor(faturamento)
print(f"O menor valor de faturamento em um dia do mês foi R${menor_vlr}")

# poderia usar a função pronta max()
maior_vlr = maior_valor(faturamento)
print(f"O maior valor de faturamento em um dia do mês foi R${maior_vlr}")

acima_media = dias_acima_media(faturamento)
print(f"Número de dias com faturamento acima da média mensal: {acima_media}")
