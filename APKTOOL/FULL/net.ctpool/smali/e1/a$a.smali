.class Le1/a$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final a:Lp1/h;

.field private b:Lp1/h;


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lp1/h;Lp1/h;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Le1/a$a;->a:Lp1/h;

    .line 5
    .line 6
    iput-object p3, p0, Le1/a$a;->b:Lp1/h;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lp1/i;

    .line 8
    .line 9
    iget-object v1, p0, Le1/a$a;->b:Lp1/h;

    .line 10
    .line 11
    iget v2, p1, Landroid/os/Message;->what:I

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    if-eq v2, v3, :cond_2

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    if-eq v2, v3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object v2, Lp1/l;->n:Lp1/l$a;

    .line 21
    .line 22
    iget v3, p1, Landroid/os/Message;->arg1:I

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Lp1/l$a;->a(I)Lp1/l;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    iget-object p1, p0, Le1/a$a;->a:Lp1/h;

    .line 31
    .line 32
    invoke-interface {p1, v0, v2}, Lp1/h;->b(Lp1/i;Lp1/l;)V

    .line 33
    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    invoke-interface {v1, v0, v2}, Lp1/h;->b(Lp1/i;Lp1/l;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v2, "Invalid VisibilityState value: "

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 54
    .line 55
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v0

    .line 66
    :cond_2
    sget-object v2, Lp1/e;->n:Lp1/e$a;

    .line 67
    .line 68
    iget v3, p1, Landroid/os/Message;->arg1:I

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Lp1/e$a;->a(I)Lp1/e;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-eqz v2, :cond_4

    .line 75
    .line 76
    iget-object p1, p0, Le1/a$a;->a:Lp1/h;

    .line 77
    .line 78
    invoke-interface {p1, v0, v2}, Lp1/h;->a(Lp1/i;Lp1/e;)V

    .line 79
    .line 80
    .line 81
    if-eqz v1, :cond_3

    .line 82
    .line 83
    invoke-interface {v1, v0, v2}, Lp1/h;->a(Lp1/i;Lp1/e;)V

    .line 84
    .line 85
    .line 86
    :cond_3
    :goto_0
    return-void

    .line 87
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 88
    .line 89
    new-instance v1, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    const-string v2, "Invalid ImageLoadStatus value: "

    .line 95
    .line 96
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 100
    .line 101
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw v0
.end method
