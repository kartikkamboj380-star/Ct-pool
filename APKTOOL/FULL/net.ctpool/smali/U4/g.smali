.class public final LU4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR4/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU4/g$a;
    }
.end annotation


# instance fields
.field private final m:LT4/c;

.field final n:Z


# direct methods
.method public constructor <init>(LT4/c;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LU4/g;->m:LT4/c;

    .line 5
    .line 6
    iput-boolean p2, p0, LU4/g;->n:Z

    .line 7
    .line 8
    return-void
.end method

.method private b(LR4/d;Ljava/lang/reflect/Type;)LR4/q;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    if-eq p2, v0, :cond_1

    .line 4
    .line 5
    const-class v0, Ljava/lang/Boolean;

    .line 6
    .line 7
    if-ne p2, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p2}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-virtual {p1, p2}, LR4/d;->k(Lcom/google/gson/reflect/TypeToken;)LR4/q;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    :goto_0
    sget-object p1, LU4/m;->f:LR4/q;

    .line 20
    .line 21
    :goto_1
    return-object p1
.end method


# virtual methods
.method public a(LR4/d;Lcom/google/gson/reflect/TypeToken;)LR4/q;
    .locals 11

    .line 1
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-class v2, Ljava/util/Map;

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return-object p1

    .line 19
    :cond_0
    invoke-static {v0, v1}, LT4/b;->j(Ljava/lang/reflect/Type;Ljava/lang/Class;)[Ljava/lang/reflect/Type;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    aget-object v2, v0, v1

    .line 25
    .line 26
    invoke-direct {p0, p1, v2}, LU4/g;->b(LR4/d;Ljava/lang/reflect/Type;)LR4/q;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    const/4 v2, 0x1

    .line 31
    aget-object v3, v0, v2

    .line 32
    .line 33
    invoke-static {v3}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {p1, v3}, LR4/d;->k(Lcom/google/gson/reflect/TypeToken;)LR4/q;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    iget-object v3, p0, LU4/g;->m:LT4/c;

    .line 42
    .line 43
    invoke-virtual {v3, p2}, LT4/c;->b(Lcom/google/gson/reflect/TypeToken;)LT4/i;

    .line 44
    .line 45
    .line 46
    move-result-object v10

    .line 47
    new-instance p2, LU4/g$a;

    .line 48
    .line 49
    aget-object v6, v0, v1

    .line 50
    .line 51
    aget-object v8, v0, v2

    .line 52
    .line 53
    move-object v3, p2

    .line 54
    move-object v4, p0

    .line 55
    move-object v5, p1

    .line 56
    invoke-direct/range {v3 .. v10}, LU4/g$a;-><init>(LU4/g;LR4/d;Ljava/lang/reflect/Type;LR4/q;Ljava/lang/reflect/Type;LR4/q;LT4/i;)V

    .line 57
    .line 58
    .line 59
    return-object p2
.end method
