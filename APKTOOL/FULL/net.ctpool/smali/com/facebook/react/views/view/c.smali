.class abstract Lcom/facebook/react/views/view/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/reflect/Method; = null

.field private static b:Ljava/lang/reflect/Method; = null

.field private static c:Z = false


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Landroid/graphics/Canvas;Z)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    if-eqz p1, :cond_0

    invoke-static {p0}, Lcom/facebook/react/views/view/a;->a(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/facebook/react/views/view/b;->a(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/facebook/react/views/view/c;->b()V

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    :try_start_0
    sget-object v1, Lcom/facebook/react/views/view/c;->a:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_2

    invoke-virtual {v1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-nez p1, :cond_3

    sget-object p1, Lcom/facebook/react/views/view/c;->b:Ljava/lang/reflect/Method;

    if-eqz p1, :cond_3

    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    :goto_0
    return-void
.end method

.method private static b()V
    .locals 8

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/view/c;->c:Z

    if-nez v0, :cond_3

    const/4 v0, 0x1

    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v2, 0x1c

    const-string v3, "insertInorderBarrier"

    const-string v4, "insertReorderBarrier"

    const-class v5, Landroid/graphics/Canvas;

    if-ne v1, v2, :cond_0

    :try_start_1
    const-class v1, Ljava/lang/Class;

    const-string v2, "getDeclaredMethod"

    const-class v6, Ljava/lang/String;

    const-class v7, [Ljava/lang/Class;

    filled-new-array {v6, v7}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v1, v2, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v2, 0x0

    new-array v6, v2, [Ljava/lang/Class;

    filled-new-array {v4, v6}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v5, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/reflect/Method;

    sput-object v4, Lcom/facebook/react/views/view/c;->a:Ljava/lang/reflect/Method;

    new-array v2, v2, [Ljava/lang/Class;

    filled-new-array {v3, v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v5, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/reflect/Method;

    :goto_0
    sput-object v1, Lcom/facebook/react/views/view/c;->b:Ljava/lang/reflect/Method;

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v5, v4, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    sput-object v2, Lcom/facebook/react/views/view/c;->a:Ljava/lang/reflect/Method;

    invoke-virtual {v5, v3, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    goto :goto_0

    :goto_1
    sget-object v1, Lcom/facebook/react/views/view/c;->a:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_2

    sget-object v2, Lcom/facebook/react/views/view/c;->b:Ljava/lang/reflect/Method;

    if-nez v2, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sget-object v1, Lcom/facebook/react/views/view/c;->b:Ljava/lang/reflect/Method;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :cond_2
    :goto_2
    return-void

    :catch_0
    :goto_3
    sput-boolean v0, Lcom/facebook/react/views/view/c;->c:Z

    :cond_3
    return-void
.end method
