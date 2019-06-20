# 290. 单词规律

![难度](https://img.shields.io/badge/难度-简单-5cb85c.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-set/map-violet.svg?style=flat)

---

## 题目描述

给定一种规律 `pattern` 和一个字符串 `str` ，判断 `str` 是否遵循相同的规律。

这里的 遵循 指完全匹配，例如， `pattern` 里的每个字母和字符串 `str` 中的每个非空单词之间存在着双向连接的对应规律。

**示例1:**

&emsp;**输入:** `pattern = "abba"`, `str = "dog cat cat dog"`  
&emsp;**输出:** `true`

**示例 2:**

&emsp;**输入:** `pattern = "abba"`, `str = "dog cat cat fish"`  
&emsp;**输出:** `false`

**示例 3:**

&emsp;**输入:** `pattern = "aaaa"`, `str = "dog cat cat dog"`  
&emsp;**输出:** `false`

**示例 4:**

&emsp;**输入:** `pattern = "abba"`, `str = "dog dog dog dog"`  
&emsp;**输出:** `false`

**说明:**  
你可以假设 pattern 只包含小写字母， str 包含了由单个空格分隔的小写字母。    

> 来源：力扣（LeetCode）
> 链接：https://leetcode-cn.com/problems/word-pattern
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

---