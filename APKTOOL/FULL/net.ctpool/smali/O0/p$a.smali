.class LO0/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO0/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO0/p;->a(Ljava/lang/Object;)LO0/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, LO0/p$a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LO0/p$a;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method
