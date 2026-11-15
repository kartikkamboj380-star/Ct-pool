.class public final synthetic Lh4/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/c;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh4/e0;->a:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final a(Lz3/l;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/e0;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-static {v0, p1}, Lh4/f0;->a(Ljava/util/concurrent/CountDownLatch;Lz3/l;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
