.class final Lcom/google/firebase/messaging/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw4/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/messaging/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# static fields
.field static final a:Lcom/google/firebase/messaging/a$b;

.field private static final b:Lw4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/firebase/messaging/a$b;

    invoke-direct {v0}, Lcom/google/firebase/messaging/a$b;-><init>()V

    sput-object v0, Lcom/google/firebase/messaging/a$b;->a:Lcom/google/firebase/messaging/a$b;

    const-string v0, "messagingClientEvent"

    invoke-static {v0}, Lw4/c;->a(Ljava/lang/String;)Lw4/c$b;

    move-result-object v0

    invoke-static {}, Lz4/a;->b()Lz4/a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lz4/a;->c(I)Lz4/a;

    move-result-object v1

    invoke-virtual {v1}, Lz4/a;->a()Lz4/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw4/c$b;->b(Ljava/lang/annotation/Annotation;)Lw4/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lw4/c$b;->a()Lw4/c;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/messaging/a$b;->b:Lw4/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, LJ4/b;

    check-cast p2, Lw4/e;

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/messaging/a$b;->b(LJ4/b;Lw4/e;)V

    return-void
.end method

.method public b(LJ4/b;Lw4/e;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/messaging/a$b;->b:Lw4/c;

    .line 2
    .line 3
    invoke-virtual {p1}, LJ4/b;->a()LJ4/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p2, v0, p1}, Lw4/e;->a(Lw4/c;Ljava/lang/Object;)Lw4/e;

    .line 8
    .line 9
    .line 10
    return-void
.end method
