# 101. 对称二叉树

![难度](https://img.shields.io/badge/难度-简单-5cb85c.svg?logo=leetcode&style=flat)  ![类型](https://img.shields.io/badge/类型-二叉树,递归-violet.svg?style=flat)

## 题目描述

给定一个二叉树，检查它是否是镜像对称的。

例如，二叉树 `[1,2,2,3,4,4,3]` 是对称的。

```
    1
   / \
  2   2
 / \ / \
3  4 4  3
```

但是下面这个 `[1,2,2,null,3,null,3]` 则不是镜像对称的:

```
    1
   / \
  2   2
   \   \
   3    3
```

**说明:**

如果你可以运用递归和迭代两种方法解决这个问题，会很加分。

> 来源：力扣（LeetCode）  
> 链接：https://leetcode-cn.com/problems/symmetric-tree  
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。  

## 结题说明

可以把问题转化为判断两棵子树是否互为镜像，而两棵互为镜像的问题可以递归解决。  
两棵树如果互为镜像，首先根节点必须相同，然后数树 A 的左子树 和 B 的右子树互为镜像，A 的右子树和 B 的左子树互为镜像。  
