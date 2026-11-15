.class public abstract Lcom/google/firebase/messaging/N;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lz4/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lz4/h;->a()Lz4/h$a;

    move-result-object v0

    sget-object v1, Lcom/google/firebase/messaging/a;->a:Lx4/a;

    invoke-virtual {v0, v1}, Lz4/h$a;->d(Lx4/a;)Lz4/h$a;

    move-result-object v0

    invoke-virtual {v0}, Lz4/h$a;->c()Lz4/h;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/N;->a:Lz4/h;

    return-void
.end method

.method public static a(Ljava/lang/Object;)[B
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/messaging/N;->a:Lz4/h;

    invoke-virtual {v0, p0}, Lz4/h;->c(Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0
.end method
