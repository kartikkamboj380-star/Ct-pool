.class public abstract Lj0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(Landroid/webkit/WebSettings;)Lk0/c;
    .locals 1

    .line 1
    invoke-static {}, Lk0/f;->c()Lk0/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lk0/i;->a(Landroid/webkit/WebSettings;)Lk0/c;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static b(Landroid/webkit/WebSettings;I)V
    .locals 2

    .line 1
    sget-object v0, Lk0/d;->e0:Lk0/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/d;->m()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {p0, p1}, Lj0/a;->a(Landroid/webkit/WebSettings;I)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v0}, Lk0/d;->n()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-static {p0}, Lj0/b;->a(Landroid/webkit/WebSettings;)Lk0/c;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0, p1}, Lk0/c;->a(I)V

    .line 24
    .line 25
    .line 26
    :goto_0
    return-void

    .line 27
    :cond_1
    invoke-static {}, Lk0/d;->j()Ljava/lang/UnsupportedOperationException;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    throw p0
.end method

.method public static c(Landroid/webkit/WebSettings;I)V
    .locals 1

    .line 1
    sget-object v0, Lk0/d;->f0:Lk0/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk0/d;->n()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, Lj0/b;->a(Landroid/webkit/WebSettings;)Lk0/c;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0, p1}, Lk0/c;->b(I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-static {}, Lk0/d;->j()Ljava/lang/UnsupportedOperationException;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    throw p0
.end method
