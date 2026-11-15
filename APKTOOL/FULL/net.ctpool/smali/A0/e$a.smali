.class final LA0/e$a;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA0/e;->a(LA0/d;)Lv5/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic m:LA0/d;


# direct methods
.method constructor <init>(LA0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA0/e$a;->m:LA0/d;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lw5/l;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(LA0/f;)V
    .locals 4

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, LA0/f$c;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LA0/e$a;->m:LA0/d;

    .line 11
    .line 12
    check-cast p1, LA0/f$c;

    .line 13
    .line 14
    invoke-virtual {p1}, LA0/f$c;->a()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p1}, LA0/f$c;->b()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {p1}, LA0/f$c;->c()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {p1}, LA0/f$c;->d()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {v0, v1, v2, v3, p1}, LA0/d;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    instance-of v0, p1, LA0/f$b;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget-object v0, p0, LA0/e$a;->m:LA0/d;

    .line 39
    .line 40
    check-cast p1, LA0/f$b;

    .line 41
    .line 42
    invoke-virtual {p1}, LA0/f$b;->a()Ljava/lang/Throwable;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {v0, p1}, LA0/d;->b(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    instance-of p1, p1, LA0/f$a;

    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    iget-object p1, p0, LA0/e$a;->m:LA0/d;

    .line 55
    .line 56
    invoke-interface {p1}, LA0/d;->a()V

    .line 57
    .line 58
    .line 59
    :cond_2
    :goto_0
    return-void
.end method

.method public bridge synthetic i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LA0/f;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LA0/e$a;->a(LA0/f;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Li5/u;->a:Li5/u;

    .line 7
    .line 8
    return-object p1
.end method
