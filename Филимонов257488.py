Python 3.9.13 (tags/v3.9.13:6de2ca5, May 17 2022, 16:36:42) [MSC v.1929 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> def lesenka(n):
    if n > 9:
        return
    s = ""
    for i in range(1, n + 1):
        s += str(i)
        print(s)
lesenka(8)