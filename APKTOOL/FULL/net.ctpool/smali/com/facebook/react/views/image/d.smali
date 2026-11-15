.class public final Lcom/facebook/react/views/image/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/facebook/react/views/image/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/views/image/d;

    invoke-direct {v0}, Lcom/facebook/react/views/image/d;-><init>()V

    sput-object v0, Lcom/facebook/react/views/image/d;->a:Lcom/facebook/react/views/image/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Landroid/graphics/Shader$TileMode;
    .locals 1

    .line 1
    sget-object v0, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    return-object v0
.end method

.method public static final b()Lj1/p$b;
    .locals 2

    .line 1
    sget-object v0, Lj1/p$b;->i:Lj1/p$b;

    .line 2
    .line 3
    const-string v1, "CENTER_CROP"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static final c(Ljava/lang/String;)Lj1/p$b;
    .locals 2

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sparse-switch v0, :sswitch_data_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :sswitch_0
    const-string v0, "contain"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object p0, Lj1/p$b;->e:Lj1/p$b;

    .line 21
    .line 22
    const-string v0, "FIT_CENTER"

    .line 23
    .line 24
    invoke-static {p0, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object p0

    .line 28
    :sswitch_1
    const-string v0, "cover"

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    sget-object p0, Lj1/p$b;->i:Lj1/p$b;

    .line 38
    .line 39
    const-string v0, "CENTER_CROP"

    .line 40
    .line 41
    invoke-static {p0, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object p0

    .line 45
    :sswitch_2
    const-string v0, "repeat"

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    sget-object p0, Lcom/facebook/react/views/image/j;->l:Lcom/facebook/react/views/image/j$a;

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/facebook/react/views/image/j$a;->a()Lj1/p$b;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :sswitch_3
    const-string v0, "center"

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_3

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    sget-object p0, Lj1/p$b;->h:Lj1/p$b;

    .line 71
    .line 72
    const-string v0, "CENTER_INSIDE"

    .line 73
    .line 74
    invoke-static {p0, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-object p0

    .line 78
    :sswitch_4
    const-string v0, "stretch"

    .line 79
    .line 80
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_4

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    sget-object p0, Lj1/p$b;->a:Lj1/p$b;

    .line 88
    .line 89
    const-string v0, "FIT_XY"

    .line 90
    .line 91
    invoke-static {p0, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-object p0

    .line 95
    :cond_5
    :goto_0
    if-eqz p0, :cond_6

    .line 96
    .line 97
    new-instance v0, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    const-string v1, "Invalid resize mode: \'"

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string p0, "\'"

    .line 111
    .line 112
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    const-string v0, "ReactNative"

    .line 120
    .line 121
    invoke-static {v0, p0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :cond_6
    invoke-static {}, Lcom/facebook/react/views/image/d;->b()Lj1/p$b;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0

    .line 129
    :sswitch_data_0
    .sparse-switch
        -0x702b18fb -> :sswitch_4
        -0x514d33ab -> :sswitch_3
        -0x37b3d265 -> :sswitch_2
        0x5a753b7 -> :sswitch_1
        0x38b724d4 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final d(Ljava/lang/String;)Landroid/graphics/Shader$TileMode;
    .locals 2

    .line 1
    const-string v0, "contain"

    invoke-static {v0, p0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "cover"

    invoke-static {v0, p0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "stretch"

    invoke-static {v0, p0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "center"

    invoke-static {v0, p0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "repeat"

    invoke-static {v0, p0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    return-object p0

    :cond_1
    if-eqz p0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid resize mode: \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\'"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "ReactNative"

    invoke-static {v0, p0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    invoke-static {}, Lcom/facebook/react/views/image/d;->a()Landroid/graphics/Shader$TileMode;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_0
    sget-object p0, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    return-object p0
.end method
