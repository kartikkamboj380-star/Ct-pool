.class abstract Lcom/facebook/react/uimanager/I0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/I0$m;,
        Lcom/facebook/react/uimanager/I0$i;,
        Lcom/facebook/react/uimanager/I0$c;,
        Lcom/facebook/react/uimanager/I0$g;,
        Lcom/facebook/react/uimanager/I0$k;,
        Lcom/facebook/react/uimanager/I0$j;,
        Lcom/facebook/react/uimanager/I0$h;,
        Lcom/facebook/react/uimanager/I0$n;,
        Lcom/facebook/react/uimanager/I0$d;,
        Lcom/facebook/react/uimanager/I0$e;,
        Lcom/facebook/react/uimanager/I0$f;,
        Lcom/facebook/react/uimanager/I0$b;,
        Lcom/facebook/react/uimanager/I0$l;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/Map;

.field private static final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/facebook/react/uimanager/I0;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/facebook/react/uimanager/I0;->b:Ljava/util/Map;

    return-void
.end method

.method static bridge synthetic a(I)Ljava/lang/ThreadLocal;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/uimanager/I0;->e(I)Ljava/lang/ThreadLocal;

    move-result-object p0

    return-object p0
.end method

.method public static b()V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/I0;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    sget-object v0, Lcom/facebook/react/uimanager/I0;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method private static c(Lx2/a;Ljava/lang/reflect/Method;Ljava/lang/Class;)Lcom/facebook/react/uimanager/I0$m;
    .locals 2

    .line 1
    const-class v0, Lcom/facebook/react/bridge/Dynamic;

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    new-instance p2, Lcom/facebook/react/uimanager/I0$i;

    .line 6
    .line 7
    invoke-direct {p2, p0, p1}, Lcom/facebook/react/uimanager/I0$i;-><init>(Lx2/a;Ljava/lang/reflect/Method;)V

    .line 8
    .line 9
    .line 10
    return-object p2

    .line 11
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    if-ne p2, v0, :cond_1

    .line 14
    .line 15
    new-instance p2, Lcom/facebook/react/uimanager/I0$c;

    .line 16
    .line 17
    invoke-interface {p0}, Lx2/a;->defaultBoolean()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-direct {p2, p0, p1, v0}, Lcom/facebook/react/uimanager/I0$c;-><init>(Lx2/a;Ljava/lang/reflect/Method;Z)V

    .line 22
    .line 23
    .line 24
    return-object p2

    .line 25
    :cond_1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    const-string v1, "Color"

    .line 28
    .line 29
    if-ne p2, v0, :cond_3

    .line 30
    .line 31
    invoke-interface {p0}, Lx2/a;->customType()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-eqz p2, :cond_2

    .line 40
    .line 41
    new-instance p2, Lcom/facebook/react/uimanager/I0$g;

    .line 42
    .line 43
    invoke-interface {p0}, Lx2/a;->defaultInt()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-direct {p2, p0, p1, v0}, Lcom/facebook/react/uimanager/I0$g;-><init>(Lx2/a;Ljava/lang/reflect/Method;I)V

    .line 48
    .line 49
    .line 50
    return-object p2

    .line 51
    :cond_2
    new-instance p2, Lcom/facebook/react/uimanager/I0$k;

    .line 52
    .line 53
    invoke-interface {p0}, Lx2/a;->defaultInt()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-direct {p2, p0, p1, v0}, Lcom/facebook/react/uimanager/I0$k;-><init>(Lx2/a;Ljava/lang/reflect/Method;I)V

    .line 58
    .line 59
    .line 60
    return-object p2

    .line 61
    :cond_3
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 62
    .line 63
    if-ne p2, v0, :cond_4

    .line 64
    .line 65
    new-instance p2, Lcom/facebook/react/uimanager/I0$j;

    .line 66
    .line 67
    invoke-interface {p0}, Lx2/a;->defaultFloat()F

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-direct {p2, p0, p1, v0}, Lcom/facebook/react/uimanager/I0$j;-><init>(Lx2/a;Ljava/lang/reflect/Method;F)V

    .line 72
    .line 73
    .line 74
    return-object p2

    .line 75
    :cond_4
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 76
    .line 77
    if-ne p2, v0, :cond_5

    .line 78
    .line 79
    new-instance p2, Lcom/facebook/react/uimanager/I0$h;

    .line 80
    .line 81
    invoke-interface {p0}, Lx2/a;->defaultDouble()D

    .line 82
    .line 83
    .line 84
    move-result-wide v0

    .line 85
    invoke-direct {p2, p0, p1, v0, v1}, Lcom/facebook/react/uimanager/I0$h;-><init>(Lx2/a;Ljava/lang/reflect/Method;D)V

    .line 86
    .line 87
    .line 88
    return-object p2

    .line 89
    :cond_5
    const-class v0, Ljava/lang/String;

    .line 90
    .line 91
    if-ne p2, v0, :cond_6

    .line 92
    .line 93
    new-instance p2, Lcom/facebook/react/uimanager/I0$n;

    .line 94
    .line 95
    invoke-direct {p2, p0, p1}, Lcom/facebook/react/uimanager/I0$n;-><init>(Lx2/a;Ljava/lang/reflect/Method;)V

    .line 96
    .line 97
    .line 98
    return-object p2

    .line 99
    :cond_6
    const-class v0, Ljava/lang/Boolean;

    .line 100
    .line 101
    if-ne p2, v0, :cond_7

    .line 102
    .line 103
    new-instance p2, Lcom/facebook/react/uimanager/I0$d;

    .line 104
    .line 105
    invoke-direct {p2, p0, p1}, Lcom/facebook/react/uimanager/I0$d;-><init>(Lx2/a;Ljava/lang/reflect/Method;)V

    .line 106
    .line 107
    .line 108
    return-object p2

    .line 109
    :cond_7
    const-class v0, Ljava/lang/Integer;

    .line 110
    .line 111
    if-ne p2, v0, :cond_9

    .line 112
    .line 113
    invoke-interface {p0}, Lx2/a;->customType()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    if-eqz p2, :cond_8

    .line 122
    .line 123
    new-instance p2, Lcom/facebook/react/uimanager/I0$e;

    .line 124
    .line 125
    invoke-direct {p2, p0, p1}, Lcom/facebook/react/uimanager/I0$e;-><init>(Lx2/a;Ljava/lang/reflect/Method;)V

    .line 126
    .line 127
    .line 128
    return-object p2

    .line 129
    :cond_8
    new-instance p2, Lcom/facebook/react/uimanager/I0$f;

    .line 130
    .line 131
    invoke-direct {p2, p0, p1}, Lcom/facebook/react/uimanager/I0$f;-><init>(Lx2/a;Ljava/lang/reflect/Method;)V

    .line 132
    .line 133
    .line 134
    return-object p2

    .line 135
    :cond_9
    const-class v0, Lcom/facebook/react/bridge/ReadableArray;

    .line 136
    .line 137
    if-ne p2, v0, :cond_a

    .line 138
    .line 139
    new-instance p2, Lcom/facebook/react/uimanager/I0$b;

    .line 140
    .line 141
    invoke-direct {p2, p0, p1}, Lcom/facebook/react/uimanager/I0$b;-><init>(Lx2/a;Ljava/lang/reflect/Method;)V

    .line 142
    .line 143
    .line 144
    return-object p2

    .line 145
    :cond_a
    const-class v0, Lcom/facebook/react/bridge/ReadableMap;

    .line 146
    .line 147
    if-ne p2, v0, :cond_b

    .line 148
    .line 149
    new-instance p2, Lcom/facebook/react/uimanager/I0$l;

    .line 150
    .line 151
    invoke-direct {p2, p0, p1}, Lcom/facebook/react/uimanager/I0$l;-><init>(Lx2/a;Ljava/lang/reflect/Method;)V

    .line 152
    .line 153
    .line 154
    return-object p2

    .line 155
    :cond_b
    new-instance p0, Ljava/lang/RuntimeException;

    .line 156
    .line 157
    new-instance v0, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 160
    .line 161
    .line 162
    const-string v1, "Unrecognized type: "

    .line 163
    .line 164
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string p2, " for method: "

    .line 171
    .line 172
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string p2, "#"

    .line 187
    .line 188
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw p0
.end method

.method private static d(Lx2/b;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/util/Map;)V
    .locals 10

    .line 1
    invoke-interface {p0}, Lx2/b;->names()[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/facebook/react/bridge/Dynamic;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne p2, v1, :cond_0

    .line 9
    .line 10
    :goto_0
    array-length p2, v0

    .line 11
    if-ge v2, p2, :cond_6

    .line 12
    .line 13
    aget-object p2, v0, v2

    .line 14
    .line 15
    new-instance v1, Lcom/facebook/react/uimanager/I0$i;

    .line 16
    .line 17
    invoke-direct {v1, p0, p1, v2}, Lcom/facebook/react/uimanager/I0$i;-><init>(Lx2/b;Ljava/lang/reflect/Method;I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p3, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 27
    .line 28
    const-string v3, "Color"

    .line 29
    .line 30
    if-ne p2, v1, :cond_2

    .line 31
    .line 32
    :goto_1
    array-length p2, v0

    .line 33
    if-ge v2, p2, :cond_6

    .line 34
    .line 35
    invoke-interface {p0}, Lx2/b;->customType()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eqz p2, :cond_1

    .line 44
    .line 45
    aget-object p2, v0, v2

    .line 46
    .line 47
    new-instance v1, Lcom/facebook/react/uimanager/I0$g;

    .line 48
    .line 49
    invoke-interface {p0}, Lx2/b;->defaultInt()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-direct {v1, p0, p1, v2, v4}, Lcom/facebook/react/uimanager/I0$g;-><init>(Lx2/b;Ljava/lang/reflect/Method;II)V

    .line 54
    .line 55
    .line 56
    :goto_2
    invoke-interface {p3, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_1
    aget-object p2, v0, v2

    .line 61
    .line 62
    new-instance v1, Lcom/facebook/react/uimanager/I0$k;

    .line 63
    .line 64
    invoke-interface {p0}, Lx2/b;->defaultInt()I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    invoke-direct {v1, p0, p1, v2, v4}, Lcom/facebook/react/uimanager/I0$k;-><init>(Lx2/b;Ljava/lang/reflect/Method;II)V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 76
    .line 77
    if-ne p2, v1, :cond_3

    .line 78
    .line 79
    :goto_4
    array-length p2, v0

    .line 80
    if-ge v2, p2, :cond_6

    .line 81
    .line 82
    aget-object p2, v0, v2

    .line 83
    .line 84
    new-instance v1, Lcom/facebook/react/uimanager/I0$j;

    .line 85
    .line 86
    invoke-interface {p0}, Lx2/b;->defaultFloat()F

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    invoke-direct {v1, p0, p1, v2, v3}, Lcom/facebook/react/uimanager/I0$j;-><init>(Lx2/b;Ljava/lang/reflect/Method;IF)V

    .line 91
    .line 92
    .line 93
    invoke-interface {p3, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    add-int/lit8 v2, v2, 0x1

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_3
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 100
    .line 101
    if-ne p2, v1, :cond_4

    .line 102
    .line 103
    :goto_5
    array-length p2, v0

    .line 104
    if-ge v2, p2, :cond_6

    .line 105
    .line 106
    aget-object p2, v0, v2

    .line 107
    .line 108
    new-instance v1, Lcom/facebook/react/uimanager/I0$h;

    .line 109
    .line 110
    invoke-interface {p0}, Lx2/b;->defaultDouble()D

    .line 111
    .line 112
    .line 113
    move-result-wide v8

    .line 114
    move-object v4, v1

    .line 115
    move-object v5, p0

    .line 116
    move-object v6, p1

    .line 117
    move v7, v2

    .line 118
    invoke-direct/range {v4 .. v9}, Lcom/facebook/react/uimanager/I0$h;-><init>(Lx2/b;Ljava/lang/reflect/Method;ID)V

    .line 119
    .line 120
    .line 121
    invoke-interface {p3, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    add-int/lit8 v2, v2, 0x1

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_4
    const-class v1, Ljava/lang/Integer;

    .line 128
    .line 129
    if-ne p2, v1, :cond_7

    .line 130
    .line 131
    :goto_6
    array-length p2, v0

    .line 132
    if-ge v2, p2, :cond_6

    .line 133
    .line 134
    invoke-interface {p0}, Lx2/b;->customType()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    if-eqz p2, :cond_5

    .line 143
    .line 144
    aget-object p2, v0, v2

    .line 145
    .line 146
    new-instance v1, Lcom/facebook/react/uimanager/I0$e;

    .line 147
    .line 148
    invoke-direct {v1, p0, p1, v2}, Lcom/facebook/react/uimanager/I0$e;-><init>(Lx2/b;Ljava/lang/reflect/Method;I)V

    .line 149
    .line 150
    .line 151
    :goto_7
    invoke-interface {p3, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    goto :goto_8

    .line 155
    :cond_5
    aget-object p2, v0, v2

    .line 156
    .line 157
    new-instance v1, Lcom/facebook/react/uimanager/I0$f;

    .line 158
    .line 159
    invoke-direct {v1, p0, p1, v2}, Lcom/facebook/react/uimanager/I0$f;-><init>(Lx2/b;Ljava/lang/reflect/Method;I)V

    .line 160
    .line 161
    .line 162
    goto :goto_7

    .line 163
    :goto_8
    add-int/lit8 v2, v2, 0x1

    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_6
    return-void

    .line 167
    :cond_7
    new-instance p0, Ljava/lang/RuntimeException;

    .line 168
    .line 169
    new-instance p3, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 172
    .line 173
    .line 174
    const-string v0, "Unrecognized type: "

    .line 175
    .line 176
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string p2, " for method: "

    .line 183
    .line 184
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p2

    .line 195
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const-string p2, "#"

    .line 199
    .line 200
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    throw p0
.end method

.method private static e(I)Ljava/lang/ThreadLocal;
    .locals 1

    .line 1
    if-gtz p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/facebook/react/uimanager/I0$a;

    invoke-direct {v0, p0}, Lcom/facebook/react/uimanager/I0$a;-><init>(I)V

    return-object v0
.end method

.method private static f(Ljava/lang/Class;Ljava/util/Map;)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_5

    aget-object v4, v0, v3

    const-class v5, Lx2/a;

    invoke-virtual {v4, v5}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v5

    check-cast v5, Lx2/a;

    const-string v6, "#"

    const/4 v7, 0x1

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    array-length v9, v8

    if-ne v9, v7, :cond_0

    invoke-interface {v5}, Lx2/a;->name()Ljava/lang/String;

    move-result-object v9

    aget-object v8, v8, v2

    invoke-static {v5, v4, v8}, Lcom/facebook/react/uimanager/I0;->c(Lx2/a;Ljava/lang/reflect/Method;Ljava/lang/Class;)Lcom/facebook/react/uimanager/I0$m;

    move-result-object v5

    invoke-interface {p1, v9, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Wrong number of args for prop setter: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_1
    const-class v5, Lx2/b;

    invoke-virtual {v4, v5}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v5

    check-cast v5, Lx2/b;

    if-eqz v5, :cond_4

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    array-length v9, v8

    const/4 v10, 0x2

    if-ne v9, v10, :cond_3

    aget-object v9, v8, v2

    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v9, v10, :cond_2

    aget-object v6, v8, v7

    invoke-static {v5, v4, v6, p1}, Lcom/facebook/react/uimanager/I0;->d(Lx2/b;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Second argument should be property index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Wrong number of args for group prop setter: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_5
    return-void
.end method

.method private static g(Ljava/lang/Class;Ljava/util/Map;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_7

    aget-object v3, v0, v2

    const-class v4, Lx2/a;

    invoke-virtual {v3, v4}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v4

    check-cast v4, Lx2/a;

    const-string v5, "First param should be a view subclass to be updated: "

    const-class v6, Landroid/view/View;

    const/4 v7, 0x2

    const/4 v8, 0x1

    const-string v9, "#"

    if-eqz v4, :cond_2

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v10

    array-length v11, v10

    if-ne v11, v7, :cond_1

    aget-object v11, v10, v1

    invoke-virtual {v6, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_0

    invoke-interface {v4}, Lx2/a;->name()Ljava/lang/String;

    move-result-object v11

    aget-object v10, v10, v8

    invoke-static {v4, v3, v10}, Lcom/facebook/react/uimanager/I0;->c(Lx2/a;Ljava/lang/reflect/Method;Ljava/lang/Class;)Lcom/facebook/react/uimanager/I0$m;

    move-result-object v4

    invoke-interface {p1, v11, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Wrong number of args for prop setter: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    const-class v4, Lx2/b;

    invoke-virtual {v3, v4}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v4

    check-cast v4, Lx2/b;

    if-eqz v4, :cond_6

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v10

    array-length v11, v10

    const/4 v12, 0x3

    if-ne v11, v12, :cond_5

    aget-object v11, v10, v1

    invoke-virtual {v6, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_4

    aget-object v5, v10, v8

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v5, v6, :cond_3

    aget-object v5, v10, v7

    invoke-static {v4, v3, v5, p1}, Lcom/facebook/react/uimanager/I0;->d(Lx2/b;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Second argument should be property index: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Wrong number of args for group prop setter: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_7
    return-void
.end method

.method static h(Ljava/lang/Class;)Ljava/util/Map;
    .locals 5

    .line 1
    if-nez p0, :cond_0

    sget-object p0, Lcom/facebook/react/uimanager/I0;->b:Ljava/util/Map;

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    const-class v4, Lcom/facebook/react/uimanager/U;

    if-ne v3, v4, :cond_1

    sget-object p0, Lcom/facebook/react/uimanager/I0;->b:Ljava/util/Map;

    return-object p0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/facebook/react/uimanager/I0;->a:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-eqz v1, :cond_3

    return-object v1

    :cond_3
    new-instance v1, Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/react/uimanager/I0;->h(Ljava/lang/Class;)Ljava/util/Map;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-static {p0, v1}, Lcom/facebook/react/uimanager/I0;->f(Ljava/lang/Class;Ljava/util/Map;)V

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method static i(Ljava/lang/Class;)Ljava/util/Map;
    .locals 3

    .line 1
    const-class v0, Lcom/facebook/react/uimanager/ViewManager;

    if-ne p0, v0, :cond_0

    sget-object p0, Lcom/facebook/react/uimanager/I0;->b:Ljava/util/Map;

    return-object p0

    :cond_0
    sget-object v0, Lcom/facebook/react/uimanager/I0;->a:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    new-instance v1, Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/react/uimanager/I0;->i(Ljava/lang/Class;)Ljava/util/Map;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-static {p0, v1}, Lcom/facebook/react/uimanager/I0;->g(Ljava/lang/Class;Ljava/util/Map;)V

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method
