.class final Lcom/google/android/gms/internal/auth/S0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/auth/m1;


# static fields
.field private static final b:Lcom/google/android/gms/internal/auth/X0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/auth/X0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/auth/Q0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/auth/Q0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/auth/S0;->b:Lcom/google/android/gms/internal/auth/X0;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/auth/R0;

    invoke-static {}, Lcom/google/android/gms/internal/auth/A0;->a()Lcom/google/android/gms/internal/auth/A0;

    move-result-object v1

    :try_start_0
    const-string v2, "com.google.protobuf.DescriptorMessageInfoFactory"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v3, "getInstance"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v4, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/auth/X0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v2, Lcom/google/android/gms/internal/auth/S0;->b:Lcom/google/android/gms/internal/auth/X0;

    :goto_0
    const/4 v3, 0x2

    new-array v3, v3, [Lcom/google/android/gms/internal/auth/X0;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v2, v3, v1

    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/auth/R0;-><init>([Lcom/google/android/gms/internal/auth/X0;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Lcom/google/android/gms/internal/auth/G0;->d:[B

    iput-object v0, p0, Lcom/google/android/gms/internal/auth/S0;->a:Lcom/google/android/gms/internal/auth/X0;

    return-void
.end method

.method private static b(Lcom/google/android/gms/internal/auth/W0;)Z
    .locals 1

    .line 1
    invoke-interface {p0}, Lcom/google/android/gms/internal/auth/W0;->zzc()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lcom/google/android/gms/internal/auth/l1;
    .locals 8

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/auth/n1;->d(Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/auth/S0;->a:Lcom/google/android/gms/internal/auth/X0;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/auth/X0;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/auth/W0;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/auth/W0;->zzb()Z

    move-result v0

    const-class v1, Lcom/google/android/gms/internal/auth/C0;

    if-eqz v0, :cond_1

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/auth/n1;->b()Lcom/google/android/gms/internal/auth/q1;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/auth/y0;->b()Lcom/google/android/gms/internal/auth/w0;

    move-result-object v0

    :goto_0
    invoke-interface {v2}, Lcom/google/android/gms/internal/auth/W0;->a()Lcom/google/android/gms/internal/auth/Z0;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/auth/e1;->a(Lcom/google/android/gms/internal/auth/q1;Lcom/google/android/gms/internal/auth/w0;Lcom/google/android/gms/internal/auth/Z0;)Lcom/google/android/gms/internal/auth/e1;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/auth/n1;->a()Lcom/google/android/gms/internal/auth/q1;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/auth/y0;->a()Lcom/google/android/gms/internal/auth/w0;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v2}, Lcom/google/android/gms/internal/auth/S0;->b(Lcom/google/android/gms/internal/auth/W0;)Z

    move-result v0

    invoke-static {}, Lcom/google/android/gms/internal/auth/g1;->b()Lcom/google/android/gms/internal/auth/f1;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/auth/P0;->d()Lcom/google/android/gms/internal/auth/P0;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/auth/n1;->b()Lcom/google/android/gms/internal/auth/q1;

    move-result-object v5

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/auth/y0;->b()Lcom/google/android/gms/internal/auth/w0;

    move-result-object v6

    :goto_1
    invoke-static {}, Lcom/google/android/gms/internal/auth/V0;->b()Lcom/google/android/gms/internal/auth/U0;

    move-result-object v7

    :goto_2
    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/auth/d1;->r(Ljava/lang/Class;Lcom/google/android/gms/internal/auth/W0;Lcom/google/android/gms/internal/auth/f1;Lcom/google/android/gms/internal/auth/P0;Lcom/google/android/gms/internal/auth/q1;Lcom/google/android/gms/internal/auth/w0;Lcom/google/android/gms/internal/auth/U0;)Lcom/google/android/gms/internal/auth/d1;

    move-result-object p1

    goto :goto_4

    :cond_2
    const/4 v6, 0x0

    goto :goto_1

    :cond_3
    invoke-static {v2}, Lcom/google/android/gms/internal/auth/S0;->b(Lcom/google/android/gms/internal/auth/W0;)Z

    move-result v0

    invoke-static {}, Lcom/google/android/gms/internal/auth/g1;->a()Lcom/google/android/gms/internal/auth/f1;

    move-result-object v3

    invoke-static {}, Lcom/google/android/gms/internal/auth/P0;->c()Lcom/google/android/gms/internal/auth/P0;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/internal/auth/n1;->a()Lcom/google/android/gms/internal/auth/q1;

    move-result-object v5

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/google/android/gms/internal/auth/y0;->a()Lcom/google/android/gms/internal/auth/w0;

    move-result-object v6

    :goto_3
    invoke-static {}, Lcom/google/android/gms/internal/auth/V0;->a()Lcom/google/android/gms/internal/auth/U0;

    move-result-object v7

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    goto :goto_3

    :goto_4
    return-object p1
.end method
