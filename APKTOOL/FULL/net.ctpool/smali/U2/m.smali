.class public abstract LU2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lz4/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lz4/h;->a()Lz4/h$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LU2/a;->a:Lx4/a;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lz4/h$a;->d(Lx4/a;)Lz4/h$a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lz4/h$a;->c()Lz4/h;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, LU2/m;->a:Lz4/h;

    .line 16
    .line 17
    return-void
.end method

.method public static a(Ljava/lang/Object;)[B
    .locals 1

    .line 1
    sget-object v0, LU2/m;->a:Lz4/h;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lz4/h;->c(Ljava/lang/Object;)[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
