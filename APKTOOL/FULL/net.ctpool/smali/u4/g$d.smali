.class Lu4/g$d;
.super Lu4/g$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu4/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private final a:Lz3/m;

.field private final b:LD4/b;


# direct methods
.method public constructor <init>(LD4/b;Lz3/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lu4/g$a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu4/g$d;->b:LD4/b;

    .line 5
    .line 6
    iput-object p2, p0, Lu4/g$d;->a:Lz3/m;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public E(Lcom/google/android/gms/common/api/Status;Lu4/a;)V
    .locals 4

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    new-instance v0, Lt4/c;

    .line 6
    .line 7
    invoke-direct {v0, p2}, Lt4/c;-><init>(Lu4/a;)V

    .line 8
    .line 9
    .line 10
    :goto_0
    iget-object v1, p0, Lu4/g$d;->a:Lz3/m;

    .line 11
    .line 12
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/common/api/internal/TaskUtil;->setResultOrApiException(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lz3/m;)V

    .line 13
    .line 14
    .line 15
    if-nez p2, :cond_1

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    invoke-virtual {p2}, Lu4/a;->B0()Landroid/os/Bundle;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string p2, "scionData"

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_4

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    if-nez p2, :cond_2

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    iget-object p2, p0, Lu4/g$d;->b:LD4/b;

    .line 38
    .line 39
    invoke-interface {p2}, LD4/b;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    check-cast p2, LZ3/a;

    .line 44
    .line 45
    if-nez p2, :cond_3

    .line 46
    .line 47
    return-void

    .line 48
    :cond_3
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_4

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    const-string v3, "fdl"

    .line 73
    .line 74
    invoke-interface {p2, v3, v1, v2}, LZ3/a;->b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    :goto_2
    return-void
.end method
