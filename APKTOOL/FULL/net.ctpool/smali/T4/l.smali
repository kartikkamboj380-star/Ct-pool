.class public abstract LT4/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT4/l$b;
    }
.end annotation


# direct methods
.method public static a(Ljava/lang/reflect/AccessibleObject;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    sget-object v0, LT4/l$b;->a:LT4/l$b;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, LT4/l$b;->a(Ljava/lang/reflect/AccessibleObject;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static b(Ljava/util/List;Ljava/lang/Class;)LR4/n;
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    sget-object p0, LR4/n;->m:LR4/n;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    throw p0
.end method
